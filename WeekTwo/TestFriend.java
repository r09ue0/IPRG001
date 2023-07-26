class TestFriend
{
    Friend friendOne,friendTwo, friendThree;
    
    TestFriend()
    {
        
        friendOne = new Friend("Peter");
        friendTwo = new Friend("Tessa");
        friendThree = new Friend();
        
        friendOne.sayHello();
        friendTwo.sayHello();
        friendThree.sayHello();
    }
   
}