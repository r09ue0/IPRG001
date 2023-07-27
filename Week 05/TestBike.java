public class TestBike
{
    Bike b1, b2;
    Wheel fw, bw;
    TestBike()
    {
        fw = new Wheel(100);
        bw = new Wheel(100);
        // Create the Bike objects:
        b1 = new Bike("Black", fw, bw);
        b1.moveBackward(10);

        /*String colour = b1.getColour(); //call accessor getColour()
        System.out.println(“My bike is currently painted: “ + colour);
        b1.setColour(“Green”); //call mutator setColour()
        System.out.println(“My bike is now painted: “ +
        b1.getColour());*/

    }
}