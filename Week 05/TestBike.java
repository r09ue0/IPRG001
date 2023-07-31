public class TestBike
{
    private Bike bike1, bike2;
    private Wheel frontWheel, backWheel;
    
    public TestBike()
    {
        frontWheel = new Wheel(100);
        backWheel = new Wheel(100);
        // Create the Bike objects:
        bike1 = new Bike("Black", frontWheel, backWheel);
        bike1.moveBackward(10);
        System.out.println(bike1.toString());

        /*String colour = b1.getColour(); //call accessor getColour()
        System.out.println(“My bike is currently painted: “ + colour);
        b1.setColour(“Green”); //call mutator setColour()
        System.out.println(“My bike is now painted: “ +
        b1.getColour());*/

    }
}