public class Person
{
    private String name;
    private int numFriends;
    private int table2D [][]  ={{3,2,1},
                                {5,2,8},
                                {4,9,7},
                                {6,7,4}};
    private int table3D[][][] = {{{5,7},{19,20}},
                                 {{15,32},{7,8}},
                                 {{79,13},{11,25}}};

    public Person(String theName, int theNumFriends)
    {
        name = theName;
        numFriends = theNumFriends;  
    } 

    public void basicSwitch(int x)
    {
        switch(x)
        {     
            case 3: 
            System.out.println("x is 3");
            break;
            case 2: 
            System.out.println("x is 2");
            break;
            default:    
            System.out.println("x is not 2 or 3");
        }
    }

    public void showTable2D()
    {

        //System.out.println(""+table2D[0][0]+table2D[1][1]); System.out.println(""+table2D[3][1]+table2D[2][1]); System.out.println(""+table2D[4][0]); // error – no index 4!!!!

        // Write a nested for loop to show all values
        for(int i=0; i<table2D.length; i++)
        {
            for(int j=0; j<table2D[i].length; j++)
            {
                System.out.print(table2D[i][j] +" ");
            }
            System.out.println();
        }
    }

    public void showTable3D()
    {
        System.out.println("" + table3D[0][0][0] + table3D[0][0][1]);
    }

    public void displayPopularity()
    {
        switch(numFriends)
        {
            case 0: System.out.println("LONELY");
                break;
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("PRETTY POPULAR");
                break;
            case 5:
            default: System.out.println("LIKED BY EVERYONE");
        }
    }

    public String getName() // Accessor- NOT void
    {
        return name;
    }

    public void setName(String theName) // mutator - always void 
    {
        name = theName;
    }
}
