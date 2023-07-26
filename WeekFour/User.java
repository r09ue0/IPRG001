class User
{
   String name; 
   int birthYear; 

   // declare constants ?? 
   final int ADULT_AGE_LIMIT = 18;
   final double ADULT_RATE = 0.6;
   final double CHILD_RATE = 0.3;

   User(String theName, int theBirthYear) 
   {
       name = theName;
       birthYear = theBirthYear; 
   } 

   int birthYear() 
   {
       return birthYear; 
   } 

   int calcAge(int thisYear) 
   {
       int age = thisYear - birthYear;
       return age;
   }     

   //isAdult() method 
   boolean isAdult(int thisYear)
   {
      /*
      int age = calcAge(thisYear);
      if(age >= 18)
      {
          return true;
      }
      return false;
      */
      
      return calcAge(thisYear) >= ADULT_AGE_LIMIT;
   }
 
   //cost() method 
   double cost(int thisYear)
   {
       int age = calcAge(thisYear);
       double total = 0;
       if(isAdult(thisYear))
       {
           total = ADULT_RATE * age;
       }
       else
       {
           total = CHILD_RATE * age;
       }
       return total;
   }
} 