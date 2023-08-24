public class ProjectGroup
{
    private Person [][] groups;

    public ProjectGroup()
    {
        groups = new Person[4][2];
        groups[0][0] = new Person("Lisa",3);
        groups[0][1] = new Person("Sam",5);
        groups[1][0] = new Person("Joe",4);
        groups[1][1] = new Person("Chris",7);
        groups[2][0] = new Person("Bob",9);
        groups[2][1] = new Person("Jane",2);
        groups[3][0] = new Person("Tracy",5);
        groups[3][1] = new Person("Nathan",6);

	   System.out.println(groups[0][0].getName());
        
    }        
}