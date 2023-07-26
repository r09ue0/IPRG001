class TestFriend
{
    Friend friendOne,friendTwo, friendThree;
    
    TestFriend()
    {
        friendOne = new Friend();
        friendOne.sayHello();
        friendTwo = new Friend();
        friendTwo.sayHello();
        friendThree = new Friend();
        friendThree.sayHello();
    }
   
}