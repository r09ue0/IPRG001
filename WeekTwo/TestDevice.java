class TestDevice
{
    Device dev1, dev2;
    
    TestDevice()
    {
        dev1 = new Device("Apple", 799.99);
        dev1.activate();
        
        dev2 = new Device("Google", 690);
        dev2.activate();
    }
}