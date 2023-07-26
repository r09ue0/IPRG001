class TrafficLight
{
    
    TrafficLight()
    {
        displayInstruction("red");
        displayInstruction("orange");
        displayInstruction("green");
    }
    
    void displayInstruction(String color)
    {
        if(color.equals("red") || color.equals("orange"))
        {
            System.out.println("STOP!");
        }
        
        if(!color.equals("red") && !color.equals("orange"))
        {
            System.out.println("GO!");
        }
    }
}