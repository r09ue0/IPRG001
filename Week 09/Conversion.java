import java.util.Scanner;
import java.text.DecimalFormat;
public class Conversion
{
    private final double F_RATIO = (double)9/5;
    private final double K_RATIO = (double)8/5;
    private int readings[][] = new int[7][3];

    public Conversion()
    {
        setupReadings();
        menu();
    }
    
    private void setupReadings()
    {
        readings[0][0] = 14;
        readings[0][1] = 0;
        readings[0][2] = 8;
        
        readings[1][0] = 0;
        readings[1][1] = 17;
        readings[1][2] = 20;
        
        readings[2][0] = 16;
        readings[2][1] = 30;
        readings[2][2] = 40;
        
        readings[3][0] = 6;
        readings[3][1] = 0;
        readings[3][2] = 0;
        
        readings[4][0] = 8;
        readings[4][1] = 8;
        readings[4][2] = 10;
        
        readings[5][0] = 12;
        readings[5][1] = 0;
        readings[5][2] = 20;
        
        readings[6][0] = 10;
        readings[6][1] = 10;
        readings[6][2] = 5;
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
            /*
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
            */
            switch(action)
            {
                case 'F':
                    answer = readDouble("Enter the degrees in celsius:");
                    System.out.println(answer +" degrees is "+ format(toFahrenheit(answer)) +"F");
                    break;
                case 'K':
                    answer = readDouble("Enter the distances in miles:");
                    System.out.println(answer +" miles is "+ format(toKilometres(answer)) +"km");
                    break;
                case 'M': 
                    mileConversion();
                    break;
                case 'A': 
                    averageTemp();
                    break;
                case 'R':
                    System.out.println("Total Raifall for a Week: "+ totalRainfall());
                    break;
                case '?': 
                    help();
                    break;
                default: System.out.println("Invalid Input");
            }
            action = readChar();
        }
    }

    private char readChar()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your choice (F, K, M, A, X, R, ?): ");
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
        "A(calculate average temperature),\n"+
        "R(total rainfall for a week) or X(Exit)");
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
    
    private int totalRainfall()
    {
        int total = 0;
        for(int i=0; i<readings.length; i++)
        {
            for(int j=0; j<readings[i].length; j++)
            {
                total += readings[i][j];
            }   
        }
        return total;
    }
}